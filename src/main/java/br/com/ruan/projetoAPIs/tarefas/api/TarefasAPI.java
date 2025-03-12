package br.com.ruan.projetoAPIs.tarefas.api;

import br.com.ruan.projetoAPIs.tarefas.dto.TarefaDTO;
import br.com.ruan.projetoAPIs.tarefas.facade.TarefasFacade;
import ch.qos.logback.core.helpers.ThrowableToStringArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api/items", produces = MediaType.APPLICATION_JSON_VALUE)
public class TarefasAPI {
    @Autowired
    private TarefasFacade tarefasFacade;

    @PostMapping
    @ResponseBody
    public TarefaDTO criar(@RequestBody TarefaDTO tarefaDTO){
        return tarefasFacade.criar(tarefaDTO);
    }

    @PutMapping("/{tarefaId}")
    @ResponseBody
    public TarefaDTO atualizar(@PathVariable("tarefaId") Long tarefaId
                            , @RequestBody TarefaDTO tarefaDTO){
        return tarefasFacade.atualizar(tarefaId, tarefaDTO);
    }

    @GetMapping
    @ResponseBody
    public List<TarefaDTO> getAll(){
        return tarefasFacade.getAll();
    }

    @DeleteMapping("/{tarefaId}")
    @ResponseBody
    public String deletar(@PathVariable("tarefaId") Long tarefaId){
        tarefasFacade.delete(tarefaId);
        return "DELETED";
    }

}
