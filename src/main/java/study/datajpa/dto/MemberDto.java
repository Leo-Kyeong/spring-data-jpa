package study.datajpa.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long id;
    private String userName;
    private String teamName;
}
