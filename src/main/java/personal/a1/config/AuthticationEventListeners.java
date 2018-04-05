package personal.a1.config;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthticationEventListeners {

	@EventListener
	public void handleEventListener(
			AuthenticationSuccessEvent event) {
		System.out.println(event);
			
	}
	
	@EventListener
	public void handle2(
			AuthenticationFailureBadCredentialsEvent e) {
		System.out.println(e);
		
	}
}
