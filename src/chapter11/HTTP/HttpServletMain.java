package chapter11.HTTP;

public class HttpServletMain {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService());

	}

	
	public static void method(HttpServlet http) {
		http.service();
	}
	//메소드명 method(static)
}
