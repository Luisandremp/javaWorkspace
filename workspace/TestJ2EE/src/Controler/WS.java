package Controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Data.EleveBean;
import Data.EleveMapUtils;

@Path("/MonService")
public class WS {

	@Path("/helloWorld")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		System.out.println("Hellow World!!");
		return "HelloWorld";
	}

	@Path("/helloWorldJson")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response helloJson() {
		EleveBean eleve = new EleveBean();
		eleve.prenom = "bob";
		eleve.note = 12;

		HashMap<Integer, ArrayList<EleveBean>> mesEleves = new HashMap<Integer, ArrayList<EleveBean>>();
		EleveMapUtils.creerMesEleves(mesEleves);

		Gson gson = new Gson();
		String json = gson.toJson(mesEleves);

		return Response.status(200).entity(json).build();
	}

	@Path("/editEleve")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response editEleve(String s) {
		/*
		 * Gson gson = new Gson(); EleveBean eleve = gson.fromJson(s,
		 * EleveBean.class);
		 *
		 * eleve.prenom += "ok";
		 *
		 * String result = gson.toJson(eleve);
		 *
		 */

		Gson gson = new Gson();
		java.lang.reflect.Type type = new TypeToken<HashMap<Integer, ArrayList<EleveBean>>>() {
		}.getType();
		HashMap<Integer, ArrayList<EleveBean>> map = gson.fromJson(s, type);

		for (Entry<Integer, ArrayList<EleveBean>> eleves : map.entrySet()) {
			for (EleveBean eleveBean : eleves.getValue()) {
				eleveBean.prenom += "_ok";
			}
		}

		String result = gson.toJson(map);

		return Response.status(200).entity(result).build();
	}
}
