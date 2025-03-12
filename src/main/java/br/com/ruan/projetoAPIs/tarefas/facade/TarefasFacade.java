package br.com.ruan.projetoAPIs.tarefas.facade;

import br.com.ruan.projetoAPIs.tarefas.dto.TarefaDTO;
import br.com.ruan.projetoAPIs.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class TarefasFacade {
    private final TarefaRepository repository;

    public TarefasFacade(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaDTO criar(TarefaDTO tarefa) {
        return repository.save(tarefa);
    }

    public TarefaDTO atualizar(Long id, TarefaDTO tarefa) {
        tarefa.setId(id);
        return repository.save(tarefa);
    }

    public Optional<TarefaDTO> getById(Long id) {
        return repository.findById(id);
    }

    public List<TarefaDTO> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
