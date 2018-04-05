package a1;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.eq;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import personal.a1.config.MvcWebApplicationInitializer;
import personal.a1.config.MvcWebConfig;
import personal.a1.config.SecurityInitializer;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration(classes={SecurityInitializer.class,MvcWebConfig.class, MvcWebApplicationInitializer.class})
@ContextConfiguration(classes={MvcWebConfig.class})
public class SecurityTest {
	
	MockMvc mockMvc;
	
	@Autowired
	WebApplicationContext context;
	
	@Before
	public void setupMockMvc() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
				.apply(springSecurity())
				.build();
	}
	
	@Test
	@Ignore
	public void testSample() throws Exception {
		mockMvc.perform(formLogin().user("user").password("pass")).andDo(print()).andExpect(status().isOk());
	}

}
