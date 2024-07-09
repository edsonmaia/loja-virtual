package maia.edson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import maia.edson.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
