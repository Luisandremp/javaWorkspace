package Model;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Controller.HTTPUtils;

public class WSUtils {
	public static HashMap<Integer, ArrayList<EleveBean>> getEleves() throws Exception {
		String url = "http://localhost:8080/TestJ2EE/rest/MonService/helloWorldJson";
		// Request
		String json = HTTPUtils.sendGetOkHttpRequest(url);

		// parse json
		Gson gson = new Gson();
		java.lang.reflect.Type type = new TypeToken<HashMap<Integer, ArrayList<EleveBean>>>() {
		}.getType();

		return gson.fromJson(json, type);

	}

	public static HashMap<Integer, ArrayList<EleveBean>> updateEleves(HashMap<Integer, ArrayList<EleveBean>> mesEleves)
			throws Exception {

		String url = "http://localhost:8080/TestJ2EE/rest/MonService/editEleve";
		// Request
		Gson gson = new Gson();
		String paramJson = gson.toJson(mesEleves);
		String json = HTTPUtils.sendPostOkHttpRequest(url, paramJson);

		java.lang.reflect.Type type = new TypeToken<HashMap<Integer, ArrayList<EleveBean>>>() {
		}.getType();

		return gson.fromJson(json, type);

	}
}
