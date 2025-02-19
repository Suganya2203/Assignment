package week4HomeAssignment;

public class JavaConnection extends MySqlConnection
{

	public static void main(String[] args)
	{
		JavaConnection jv=new JavaConnection();
		jv.disconnect();
		jv.connect();
		jv.executeUpdate();
		jv.MySqlConnection();
	}

	@Override
	public void connect() {
		System.out.println("Executing Interface connect");
	}

	@Override
	public void disconnect() {
		System.out.println("Executing Interface disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executing Interface executeUpdate");
		
	}

	@Override
	public void MySqlConnection() {
		System.out.println("Executing Abstraction MySQL");
		
	}

}
