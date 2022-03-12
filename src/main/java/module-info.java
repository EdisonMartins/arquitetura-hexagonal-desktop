module conta.desktop {
    // Usar conta.sistema
    requires sistema;

    // Usar spring
    requires javax.inject;
    requires spring.tx;
    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires java.sql;

    // Usar javafx
    requires javafx.controls;

    // abre telas e builds
    opens conta.tela;
    opens conta.dsv;
    opens conta.hml;
    opens conta.prd;
}