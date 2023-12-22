package mini_gametmpk_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class ProdutoModel<Categoria> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo nome_produto é Obrigatorio!")
    @Size(min = 2, max = 50, message = "O atributo nome_produto deve conter no minimo 01 e no máximo 50 caracteres!!!")
    private String nome;

    @NotNull(message = "O Atributo Descrição é obrigatório")
    private String descricao;

    @NotBlank(message = "O atributo preço é Obrigatorio!")
    private Double preco;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

    // getters e setters

    // Certifique-se de incluir os getters e setters adequados para os atributos acima.
}
