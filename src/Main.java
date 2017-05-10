import facebook4j.FacebookFactory;import java.nio.file.NoSuchFileException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;



import java.net.MalformedURLException;
import java.net.URL;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import java.util.Scanner;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);
	private static final String CONFIG_DI= "config";
	private static final String CONFIG_FIL = "Facebook.properties";
	private static final String APP_VERSIO = "v1.0";
	
	public static void main(String[] args) throws FacebookException {
		// TODO Auto-generated method stub
		
		
		String appSecret="680eaca199c61769eaecfa92038630f5";
		String appId="423989421290334";
		
		
		
		String accessToken ="EAACEdEose0cBAN2CKFmZC2WhxI8aePz6XqzjkA8QgpZAyZArWdd83UsnwQRz2ILvkMcWVXOY9Nx9bsZAdcUusY3W1kSfEHcLeiOjBnQSfZCkMiWpsJJA8EaV19E5MZAl6lONGC8Mf2EnEMb0BKguCH9lvTYZCxUi0HbZCbSnsR8bAPdoNchTNLzZB";
        User user;
		
        Scanner scanner = new Scanner(System.in);
        
        
        
		// TODO Auto-generated method stub
		Facebook facebook = (Facebook) new FacebookFactory().getInstance();
		
		
		
		facebook.setOAuthAppId(appId, appSecret);
		
		//facebook.setOAuthPermissions(commaSeparetedPermissions);
		
		facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
		
		
		
		
		
		try {
			user =facebook.getMe();

			 System.out.println(user);
			 System.out.println("Ingresa el estado ");
				String guardar = scanner.nextLine();
			 
			 
			 facebook.postStatusMessage(guardar);
			 
			 System.out.println("Ingresa el link ");
				String guarda = scanner.nextLine();
				
			 
			 facebook.postStatusMessage(guarda);
			
			//System.out.println(facebook.getPosts());
			
			ResponseList<Post> post = facebook.getPosts();
			facebook.getPage();
			
			
          
            
        } catch (Exception e) {
        	
        	System.out.println("Ocurrio un errror, con el token proporcionado");
        	logger.error("El Token proporcionado no se encuentra activo");
		

	}

}
}
