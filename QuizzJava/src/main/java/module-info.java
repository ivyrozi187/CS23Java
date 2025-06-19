module com.ptyv.quizzjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ptyv.quizzjava to javafx.fxml;
    exports com.ptyv.quizzjava;
}
