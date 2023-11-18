package changer.pitagoras.dto;

import changer.pitagoras.dto.autenticacao.MembroDto;
import changer.pitagoras.model.Membro;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class CirculoMembrosDto {
    private UUID id;
    private String nomeCirculo;
    private UsuarioNomeEmailDto dono;
    private LocalDateTime dataCriacao;
    private List<MembroDto> membros;
}