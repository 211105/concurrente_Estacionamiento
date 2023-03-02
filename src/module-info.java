module Parking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens concurrencia;
    opens concurrencia.controller;
    opens concurrencia.Models;
}