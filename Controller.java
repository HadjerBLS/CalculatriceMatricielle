package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Controller {
    @FXML
    GridPane matA;
    @FXML
    GridPane matB;

    public void creation(Matrice matrice){

       // matA.addRow(matrice.getRow());
       // matA.addColumn(matrice.getColumn());

        for (int i = 0; i < matrice.getTabMat().length; i++){

        }

    }

    @FXML
    Button somme;

    public void addition(){

        for (int i = 0; i < matrice.getRow(); i++){

            for (int j = 0; j < matrice.getColumn(); j++){
                matrice.getTabMat()[i][j] = getNodeByRowColumnIndex(i,j, matA).hashCode() + getNodeByRowColumnIndex(i,j, matB).hashCode();
            }
        }

    }

    //stackOverFlow https://stackoverflow.com/questions/20825935/javafx-get-node-by-row-and-column
    public Node getNodeByRowColumnIndex (final int row, final int column, GridPane gridPane) {
        Node result = null;
        ObservableList<Node> childrens = gridPane.getChildren();

        for (Node node : childrens) {
            if(gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column) {
                result = node;
                break;
            }
        }

        return result;
    }

}
