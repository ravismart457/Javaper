package conceptOrientated;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;

public class JsonArray {

	public static void main(String[] args) {
		
		
		Map<String, JSONArray> GR_WEB_DATAMapForLoop = new HashMap<>();
		int u = 1;
		JSONArray jarr = new JSONArray();
		while(u<=2) {
	    
	    
		for(int i=0; i<=1; i++) 
		 {
			int j;
			int k = 0;
			if(i==1) {
				j=15;
				k=20;
			}else {
				j=0;
				k=5;
			}
			char a = 65;
			JSONObject jobj = new JSONObject();
			for(; j<=k; j++) 
			 {
				
				jobj.put(Character.toString(a), j);
				a++;
				
			}
			jarr.put(jobj);
			GR_WEB_DATAMapForLoop.put(String.valueOf(u), jarr);
		}
		
		
		u++;
		}
		
		System.out.println("MAP Print :- "+GR_WEB_DATAMapForLoop);

	}

}
