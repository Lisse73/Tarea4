module Tarea4 {
	requires javafx.controls;
	
	opens application to javafx.base;
	exports application;
}
