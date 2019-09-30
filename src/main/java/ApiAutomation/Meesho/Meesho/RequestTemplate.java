package ApiAutomation.Meesho.Meesho;

import java.util.HashMap;

public class RequestTemplate {

	public   String apiName, requestType,uri;
	public HashMap<String, String> headers = new HashMap<String,String>();
	public HashMap<String, String> parameters = new HashMap<String,String>();
	
	public RequestTemplate(String apiName,String uri, String requestType,HashMap<String, String> header,HashMap<String, String> params) {
		this.apiName = apiName;
		this.requestType=requestType;
		
		this.headers.putAll(header);
		this.parameters.putAll(params);
		
	}
	
	public String geturi() {
		return uri;
	}
	
	public void seturi(String uri) {
		this.requestType = uri;
	}
	
	public String getrequestType() {
		return requestType;
	}

	public void setrequestType(String requestType) {
		this.requestType = requestType;
	}
	
	

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	
	public HashMap<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(HashMap<String, String> headers) {
		this.headers = headers;
	}

	public HashMap<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(HashMap<String, String> parameters) {
		this.parameters = parameters;
	}
}
