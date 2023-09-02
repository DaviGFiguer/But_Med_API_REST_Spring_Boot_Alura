package med.but.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.but.api.domain.endereco.DadosEndereco;

public record DadosAtualizaPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {


}
