
//import the packages for using the classes in them into the program
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.management.JMException;

public class Menubar extends JMenuBar {

    /***************************************************************************
     ***      declaration of the private variables used in the program       ***
     ***************************************************************************/

    //for creating the JMenu for the program
    public JMenu fileMenu,  bookMenu,  memberMenu,  searchMenu,  loanMenu;
    //for creating the JMenuItem for JMenu
    public JMenuItem   exit,  addBook,  listBook;
    public JMenuItem   addMember,  listMember;
    public JMenuItem  searchBooksAndMembers,  borrowBook,  returnBook;
    //for creating an imageIcon
    public ImageIcon[] icons;
    //for creating the name of the image file 16*16
    public String[] imageName16 = {"images/Print16.gif", "images/Exit16.gif",
        "images/Add16.gif", "images/List16.gif",
        "images/Edit16.gif", "images/Delete16.gif",
        "images/Information16.gif", "images/Find16.gif",
        "images/Export16.gif", "images/Import16.gif",
        
    };

    public Menubar() {
        //for adding book, member, search, loan & help Menus to the menu bar
        this.add(fileMenu = new JMenu("File"));
        this.add(bookMenu = new JMenu("Books"));
        this.add(memberMenu = new JMenu("Members"));
        this.add(searchMenu = new JMenu("Search"));
        this.add(loanMenu = new JMenu("Loan"));

        /**
         *for setting the Mnemonic
         */
        fileMenu.setMnemonic('f');
        bookMenu.setMnemonic('b');
        memberMenu.setMnemonic('m');
        searchMenu.setMnemonic('s');
        loanMenu.setMnemonic('l');

        //for setting the image icons
        icons = new ImageIcon[12];
        for (int i = 0; i < imageName16.length; i++) {
            icons[i] = new ImageIcon(ClassLoader.getSystemResource(imageName16[i]));
        }

        //for adding print books & exit
        fileMenu.add(exit = new JMenuItem("Exit", icons[1]));

        //for adding add, list, listAvailble, listBorrowed, edit & remove Books and book information to the bookMenu
        bookMenu.add(addBook = new JMenuItem("Add Book", icons[2]));
        bookMenu.add(listBook = new JMenuItem("List All Books", icons[3]));
       

        //for adding add, list, edit & remove Members and member information to the memberMenu
        memberMenu.add(addMember = new JMenuItem("Add Member", icons[2]));
        memberMenu.add(listMember = new JMenuItem("List All Members", icons[3]));
  
        //for adding add, list & remove Members to the memberMenu
        searchMenu.add(searchBooksAndMembers = new JMenuItem("Search", icons[7]));

        //for adding borrow & return books to the loanMenu
        loanMenu.add(borrowBook = new JMenuItem("Borrow a Book", icons[8]));
        loanMenu.add(returnBook = new JMenuItem("Return a Book", icons[9]));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        searchBooksAndMembers.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        addBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        listBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));


        addMember.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        listMember.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));

        borrowBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        returnBook.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
    }
}
