package overviewMonitoring.slack;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//import org.json.JSONObject;

//public class Slack {
//	private static HttpClient client = HttpClient.newHttpClient();
//	private static final String URL = "https://hooks.slack.com/services/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";
//
//	public static void sendMessage(JSONObject content) throws IOException, InterruptedException {
//		HttpRequest request = HttpRequest.newBuilder(
//                URI.create(URL))
//                    .header("accept", "application/json")
//                    .POST(HttpRequest.BodyPublishers.ofString(content.toString()))
//                    .build();
//                
//                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//                
//                System.out.printf("Status: %s", response.statusCode());
//                System.out.printf("Response: %s", response.body());
//	}
//        
//}
