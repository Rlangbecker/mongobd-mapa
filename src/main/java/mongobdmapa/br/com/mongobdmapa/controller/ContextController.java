package mongobdmapa.br.com.mongobdmapa.controller;

import com.google.maps.errors.ApiException;
import lombok.RequiredArgsConstructor;
import mongobdmapa.br.com.mongobdmapa.service.ContextService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RequiredArgsConstructor
@RestController
@RequestMapping("/context")
public class ContextController {

    private final ContextService contextService;



    @GetMapping
    public void gerarContext() throws IOException, InterruptedException, ApiException {
        contextService.gerarContext();
    }



}
