package study.datajpa.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private UUID id;
    private String userName;
    private String teamName;

    public MemberDto(UUID id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
