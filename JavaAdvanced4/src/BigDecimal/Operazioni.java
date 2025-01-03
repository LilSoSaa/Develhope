package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Operazioni {
    ADDIZIONE("+"){
        public BigDecimal calcola(BigDecimal a, BigDecimal b) {
            return a.add(b);
        }
    },
    SOTTRAZIONE("-") {
        public BigDecimal calcola(BigDecimal a, BigDecimal b) {
            return a.subtract(b);
        }
    },
    MOLTIPLICAZIONE("*") {
        public BigDecimal calcola(BigDecimal a, BigDecimal b) {
            return a.multiply(b);
        }
    },
    DIVISIONE("/") {
        public BigDecimal calcola(BigDecimal a, BigDecimal b) {
            if (b.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("Non puoi dividere per zero");
            }
            return a.divide(b, 10, RoundingMode.HALF_UP); // Arrotonda a 10 decimali
        }
    },
    MIN("min") {
        public BigDecimal calcola(BigDecimal a, BigDecimal b) {
            return a.min(b);
        }
    },
    MAX("max") {
        public BigDecimal calcola(BigDecimal a, BigDecimal b) {
            return a.max(b);
        }
    };

    private final String simbolo;

    Operazioni(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public abstract BigDecimal calcola(BigDecimal a, BigDecimal b);

    public static Operazioni daSimbolo(String simbolo) {
        for (Operazioni operazione : Operazioni.values()) {
            if (operazione.getSimbolo().equals(simbolo)) {
                return operazione;
            }
        }
        throw new IllegalArgumentException("Operazione non riconosciuta: " + simbolo);
    }
}
