package org.lucasnscr.domain.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountInput {

    private String name;

    private String alias;

    private BigDecimal amount;

    private Long userId;

    private Long bankId;
}
