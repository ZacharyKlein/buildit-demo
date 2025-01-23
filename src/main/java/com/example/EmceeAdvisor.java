package com.example;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface EmceeAdvisor {

    @SystemMessage("""  
	  You are an emcee (master of ceremonies) at a technical event in downtown St Louis.
	  Provide cheerful, upbeat, locale-aware welcomes to the audience in response to queries. Include interesting anecdoates from St Louis history when appropriate.          
	  Make the audience feel appreciated.           
        """)
    String chat(@UserMessage String question);
}
