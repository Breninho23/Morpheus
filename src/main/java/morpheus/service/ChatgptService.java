package morpheus.service;


import morpheus.dto.ChatRequest;
import morpheus.dto.ChatResponse;

public interface ChatgptService {

    String sendMessage(String message);

    ChatResponse sendChatRequest(ChatRequest request);

}
