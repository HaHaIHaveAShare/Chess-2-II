package chess2;

import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.collections.ObservableList;
import java.net.URI;
import java.io.File;

public class Board {

    private int width;
    private int height;

    private int x = -1;
    private int y = -1;

    private GridPane pane;

    private Scene scene;
    private Stage stage;

    public EventHandler <MouseEvent> squareClicked;

    public ImageView [] [] images;
    
    public Board (int width, int height, int pxwidth, int pxheight, String background)  {

	this.squareClicked = new EventHandler <MouseEvent> ()  {
		@Override
		public void handle (MouseEvent e) {
		    x = pane.getRowIndex((ImageView)e.getSource()) == null ? 0 : pane.getRowIndex((ImageView)e.getSource());
		    y = pane.getColumnIndex((ImageView)e.getSource()) == null ? 0 : pane.getColumnIndex((ImageView)e.getSource());
		}
	    };
	
	this.width = width;
	this.height = height;

	this.images = new ImageView [width] [height];
	
	this.pane = new GridPane ();

	this.stage = new Stage ();
	this.scene = new Scene (pane, pxwidth, pxheight);
	this.stage.setScene(scene);
	// TODO: Update to fetch playernames
	this.stage.setTitle("Player1" + " vs " + "Player2");
	this.stage.setResizable(false);
	this.stage.sizeToScene();
	this.stage.show();
	this.pane.setStyle("-fx-background-image:url('file:" + background + "')");
	
        // Sets up the board (no touching)
        for (int i = 0; i != width; i++)  {
	    for (int j = 0; j != height; j++)  {
		try  {
		    images [i] [j] = new ImageView ();
		    images [i] [j].setPickOnBounds(true);
		    pane.add(images [i] [j], j, i);
		    images [i] [j].addEventFilter(MouseEvent.MOUSE_CLICKED, squareClicked);
		}
		catch (Exception e)  {
		    System.out.println(e + " loading piece icon");
		}
	    }
	}	
    }
    public void setImage (int x, int y, Image i)  {
	this.images [x] [y].setImage(i);
    }

    public int getClickedX ()  {
	return this.x;
    }

    public int getClickedY ()  {
	return this.y;
    }

    public void resetClickedCoors ()  {
	this.x = -1;
	this.y = -1;
    }
    
    // private Node getNodeFromGridPane (GridPane gridPane, final int row, final int column)  {
    // 	Node result = null;
    // 	ObservableList<Node> children = gridPane.getChildren();
    // 	for (Node node : children) {
    // 	    if (gridPane.getRowIndex(node) == row && gridPane.getColumnIndex(node) == column)  {
    // 		result = node;
    // 		break;
    // 	    }
    // 	}
    // 	return result;
    // }
    
}
