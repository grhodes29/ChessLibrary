package com.flyoverfoods.chesslibrary;



import static com.flyoverfoods.chesslibrary.ColorType.White;

/**  https://en.wikipedia.org/wiki/Javadoc
 * @author      Giancarlo Rhodes <giancarlo.rhodes@gmail.com>
 * @version     x.x                 (current version number of program)
 * @since       x.x          (the version of the package this class was first added to)
 *
 *  standard algebraic notation (SAN)
 *    a  b   c   d   e   f  g  h
 * 8 a8 b8  c8  d8  e8  f8  g8 h8
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 *    STANDARD BOARD SETUP
 *
 *      a   b   c   d   e   f   g   h
 * 8   BC  BN  BB  BK   BQ  BB  BN  BC
 *
 * 7   BP  BP  BP  BP   BP  BP  BP  BP
 *
 * 6
 *
 * 5
 *
 * 4
 *
 * 3
 *
 * 2   WP  WP  WP  WP   WP  WP  WP  WP
 *
 * 1   WC  WN  WB  WQ   WK  WB  WN  WC
 *      a   b   c   d   e   f   g   h
 *
 *  NOTE:  a1 is BLACK, a8 is WHITE, h8 BLACK, h1 WHITE
 *
 *  ICCF numeric notation
 *
 * 18	28	38	48	58	68	78	88
 * 17	27	37	47	57	67	77	87
 * 16	26	36	46	56	66	76	86
 * 15	25	35	45	55	65	75	85
 * 14	24	34	44	54	64	74	84
 * 13	23	33	43	53	63	73	83
 * 12	22	32	42	52	62	72	82
 * 11	21	31	41	51	61	71	81
 *
 *
 *
 */
public class Board {

    private Square[] _squares;
    private ChessNotationType _notation;
    private BoardSetupType _setup;

    public Board(Square[] squares, ChessNotationType notationType, BoardSetupType setupType) {
        _squares = squares;
        _notation = notationType;
        _setup = setupType;
    }
    
    public Board(){
        _squares = new Square[64];
        _notation = ChessNotationType.ICCF_NUMERIC_NOTATION;
        _setup = BoardSetupType.STANDARD;
        InitializeSquares();
    }
    
    private void InitializeSquares(){

        // aways move from the top left (moving right) to the bottom right when creating the board
        // just like you read or write in English

        int _columnIndex = 1;  // max 8, count upward starting at 1 and ending at 8
        int _rowIndex = 8; // min 1, count downward staring at 8 and ending at 1

        ColorType _currentColor = White;

        switch (_setup) {
            case STANDARD: {

                for (Square _current : _squares) {

                    _current.location = Integer.toString(_columnIndex) +  Integer.toString(_rowIndex);
                    _current.color = _currentColor;
                    _current.isOccupied = true;

                    _columnIndex = _columnIndex + 1;

                    if (_columnIndex > 8) {
                        // reset
                        _columnIndex = 1;
                        _rowIndex = _rowIndex - 1;

                        if (_rowIndex < 1){
                            break;
                        }
                    }
                    _currentColor = FlipColor(_currentColor);
                }
                break;
            }
            default : break;

        }
    }

    private ColorType FlipColor(ColorType inCurrentColor){

        if (inCurrentColor == ColorType.Black) {
            return ColorType.White;
        }else{
            return ColorType.Black;
        }
    }
}
