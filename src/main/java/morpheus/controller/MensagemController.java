package morpheus.controller;

import morpheus.service.ChatgptService;
import morpheus.record.CorpoMensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Breno
 */
@RestController
@RequestMapping("/enviarMensagem")
public class MensagemController {

    @Autowired
    private ChatgptService chatgptService;

    @PostMapping
    public String ola(@RequestBody CorpoMensagem msg){
        String responseMessage = chatgptService.sendMessage(msg.mensagem());
        System.out.print(responseMessage); //I'm doing well, thank you. How about you?
        return  responseMessage;
    }
}
