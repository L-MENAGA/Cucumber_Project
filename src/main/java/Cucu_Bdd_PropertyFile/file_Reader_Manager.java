package Cucu_Bdd_PropertyFile;

public class file_Reader_Manager {
	private file_Reader_Manager() {
	}
	
	
	public static file_Reader_Manager getInstanceFRM() {
		file_Reader_Manager frm = new file_Reader_Manager();
		return frm;
	
	}
	public Configuration_Reader getInstanceCR() throws Throwable {
	Configuration_Reader reader = new Configuration_Reader ();
	return reader;
		

}
}