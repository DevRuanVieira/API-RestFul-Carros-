package br.com.ruan.projetoAPIs.tarefas.repository;

import br.com.ruan.projetoAPIs.tarefas.dto.TarefaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<TarefaDTO, Long> {
}
