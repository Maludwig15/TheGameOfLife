import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


// THIS IS MY NAME: MATT LUDWIG

//Conway's Game of Life!
public class ProjectPanel extends JPanel{

    private int[][] board;
    private int size;
    private Timer timer;



    public ProjectPanel(int w0, int h0){
        setSize(w0,h0);


        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                //called when the mouse is pressed.
                int x = mouseEvent.getX();
                int y = mouseEvent.getY();

                //Do some integer division to determine which [r][c] (x, y) is in.
                int r = y/size;
                int c = x/size;

                if(board[r][c] == 1)
                    board[r][c] = 0;

                else
                    board[r][c] = 1;
                repaint();



            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                //called when mouse enters the panel.

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                //called when mouse leaves the panel.
            }
        });





        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {
                int code = keyEvent.getKeyChar();
                if(code == ' '){
                    //do something that you want to happen when space is pressed.

                    //stop timer

                    timer.stop();


                }
                else if(code == '1'){
                    //do something that you want to happen when 1 is pressed.

                    //start timer

                    timer.start();


                }
                else if(code == 's'){
                    //do something that you want to happen when - is pressed.

                    //slow timer

                    timer.setDelay((timer.getDelay()*4));



                }
                else if(code == 'f'){
                    //do something that you want to happen when + is pressed.

                    //speed timer

                    timer.setDelay((timer.getDelay()/4));

                }

                else if(code == '2'){
                    //do something that you want to happen when 2 is pressed.

                    //random board

                    for (int r = 0; r < board.length; r++) {                //board.length gets number of rows
                        for (int c = 0; c < board[r].length; c++) {         //board[r].length gets number of colums
                            if(Math.random() > .5)
                                board[r][c] = 1;
                        }
                    }

                }
                else if(code == '3'){
                    //do something that you want to happen when 3 is pressed.

                    //clear board

                    for (int r = 0; r < board.length; r++) {                //board.length gets number of rows
                        for (int c = 0; c < board[r].length; c++) {         //board[r].length gets number of colums
                                board[r][c] = 0;
                        }
                    }


                }
                else if(code == '4'){
                    //do something that you want to happen when 4 is pressed.

                    //Preset Glider


                    double x = Math.random() *800;

                    double y = Math.random() *800;

                    int i = (int) x;
                    int ii = (int) y;


                    //Do some integer division to determine which [r][c] (x, y) is in.
                    int r = ii/size;
                    int c = i/size;

                    board[r - 1][c] = 1;
                    board[r][c+1] = 1;
                    board[r + 1][c + 1] = 1;
                    board[r + 1][c] = 1;
                    board[r + 1][c - 1] = 1;
                }

                else if(code == '5'){
                    //do something that you want to happen when 4 is pressed.

                    //Preset Toad


                    double x = Math.random() *800;

                    double y = Math.random() *800;

                    int i = (int) x;
                    int ii = (int) y;


                    //Do some integer division to determine which [r][c] (x, y) is in.
                    int r = ii/size;
                    int c = i/size;

                    board[r][c] = 1;
                    board[r][c+1] = 1;
                    board[r][c+2] = 1;
                    board[r+1][c] = 1;
                    board[r+1][c+1] = 1;
                    board[r+1][c-1] = 1;

                }


                else if(code == '6'){
                    //do something that you want to happen when 4 is pressed.

                    //Preset




                    double x = Math.random() *800;;

                    double y = Math.random() *800;;



                    int i = (int) x;
                    int ii = (int) y;


                    //Do some integer division to determine which [r][c] (x, y) is in.
                    int r = ii/size;
                    int c = i/size;

                    board[r][c] = 1;
                    board[r][c+1] = 1;
                    board[r+1][c] = 1;
                    board[r+1][c+1] = 1;

                    //half shell
                    board[r][c+10] = 1;
                    board[r+1][c+10] = 1;
                    board[r+2][c+10] = 1;

                    board[r-1][c+11] = 1;
                    board[r+3][c+11] = 1;

                    board[r-2][c+12] = 1;
                    board[r+4][c+12] = 1;
                    board[r-2][c+13] = 1;
                    board[r+4][c+13] = 1;

                    //2nd half of circle
                    board[r+1][c+14] = 1;
                    board[r-1][c+15] = 1;
                    board[r+3][c+15] = 1;
                    board[r+2][c+16] =1; //
                    board[r][c+16] = 1;
                    board[r+1][c+16] = 1;
                    board[r+1][c+16] = 1;
                    board[r+1][c+17] = 1;

                    //gun part 1
                    board[r-2][c+20] = 1;
                    board[r-1][c+20] = 1;
                    board[r][c+20] = 1;
                    board[r-2][c+21] = 1;
                    board[r-1][c+21] = 1;
                    board[r][c+21] = 1;
                    board[r-3][c+22] = 1;
                    board[r+1][c+22] = 1;
                    board[r-3][c+24] = 1;
                    board[r-4][c+24] = 1;
                    board[r+1][c+24] = 1;//
                    board[r+2][c+24] = 1;//

                    board[r-2][c+34] = 1;
                    board[r-1][c+34] = 1;
                    board[r-2][c+35] = 1;
                    board[r-1][c+35] = 1;




                }



                else if(code == '7') {
                    //do something that you want to happen when 7 is pressed.

                    //Preset


                    double x = Math.random() *800;

                    double y = Math.random() *800;


                    int i = (int) x;
                    int ii = (int) y;


                    //Do some integer division to determine which [r][c] (x, y) is in.
                    int r = ii / size;
                    int c = i / size;

                    board[r][c] = 1;
                    board[r][c+1] = 1;
                    board[r+1][c] = 1;
                    board[r+1][c+1] = 1;

                    board[r+2][c+2] = 1;
                    board[r+2][c+3] = 1;
                    board[r+3][c+2] = 1;
                    board[r+3][c+3] = 1;


                }






                //etc.
                repaint();

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });








        board = new int[100][100];

        //set cells randomly to 1.
        for (int r = 0; r < board.length; r++) {                //board.length gets number of rows
            for (int c = 0; c < board[r].length; c++) {         //board[r].length gets number of colums
                if(Math.random() > .5)
                    board[r][c] = 1;
            }
        }


        //initialize size to be 1/10 of the width of the screen
        size = getWidth()/board.length;


        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int[][] nextGen = new int [board.length][board[0].length];

                for (int r = 0; r < board.length; r++) {
                    for (int c = 0; c < board[r].length; c++) {

                        //loneliness
                        if(numNeighbors(r,c)<2 && board [r][c] ==1){
                            nextGen [r][c] =0;
                        }

                        //overpopulation
                        else if(numNeighbors(r,c) > 3 && board [r][c] ==1 ){
                            nextGen [r][c] =0;
                        }

                        //survives
                        else if(numNeighbors(r,c) == 2 && board [r][c] ==1 ){
                            nextGen [r][c] = 1;
                        }

                        //survives
                        else if(numNeighbors(r,c) == 3 && board [r][c] ==1 ){
                            nextGen [r][c] = 1;
                        }

                        //empty spaces w/ 3 neighbors becomes populated
                        else if(numNeighbors(r,c) == 3 && board [r][c] ==0 ){
                            nextGen [r][c] = 1;
                        }
                    }
                }
                board = nextGen;
                repaint();
            }
        });
        timer.start();
    }





    public int numNeighbors(int r, int c){
        int count = 0;

        if (r-1>-1 && c-1>-1)
            if(board[r-1][c-1]==1)
                count++;


        if (r-1>-1)
            if(board[r-1][c]==1)
                count++;


        if (r-1>-1 && c+1<board[0].length)
            if(board[r-1][c+1]==1)
                count++;


        if (c-1>-1)
            if(board[r][c-1]==1)
                count++;


        if (c+1<board[0].length)
            if(board[r][c+1]==1)
                count++;


        if (r+1<board.length && c-1>-1)
            if(board[r+1][c-1]==1)
                count++;


        if (r+1<board.length)
            if(board[r+1][c]==1)
                count++;


        if (r+1<board.length && c+1<board[0].length)
            if(board[r+1][c+1]==1)
                count++;


        return count;
    }




    public void paint(Graphics g){
        super.paint(g);  //gets rid of that trail effect.
        Graphics2D g2 = (Graphics2D)g;
        size = getWidth()/board.length; //update size if window changed.
        g2.setColor(Color.BLUE);


        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if(board[r][c] == 1){
                    g2.setColor(Color.BLUE);
                    g2.fillRect(c*size, r*size, size, size);}

                else if(board[r][c] ==2){
                    Color lightblue = new Color(105, 171, 255);
                    g2.setColor(lightblue);
                    //g2.fillRect(c*size, r*size, size, size);}
                }



                if(board[r][c] == 0){
                    g2.setColor(Color.RED);
                g2.drawRect(c*size, r*size, size, size);}
            }
        }

    }



} // end public class
