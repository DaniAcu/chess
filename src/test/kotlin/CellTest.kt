import kotlin.test.Test
import kotlin.test.assertEquals

internal class CellTest {

    /*

        - Crear una celda
            - Ocupada o no
        - Crear un board
            - Board contiene 64 celdas
            - Podemos ubicar una celda usando notacion algebraica

         */
    @Test
    fun a_new_cell_is_empty() {
        val toTest = Cell()
        assertEquals(toTest.isEmpty(), true)
    }

    @Test
    fun a_cell_with_a_piece_is_not_empty() {
        val mockPiece = Piece()
        val toTest = Cell(mockPiece)
        assertEquals(toTest.isEmpty(), false)
    }

    @Test
    fun it_should_be_empty_when_a_cell_is_cleaned() {
        val mockPiece = Piece()
        val toTest = Cell(mockPiece)
        toTest.clean()
        assertEquals(toTest.isEmpty(), true)
    }

    @Test
    fun it_should_return_null_when_it_doesnt_have_a_piece() {
        val toTest = Cell()
        val result = toTest.getPiece()
        assertEquals(result, null)
    }

    @Test
    fun it_should_return_the_piece_when_it_has_a_piece() {
        val mockPiece = Piece()
        val toTest = Cell(mockPiece)
        val result = toTest.getPiece()
        assertEquals(result, mockPiece)
    }

    @Test
    fun it_should_return_a_cell_with_a_piece() {
        val toTest = Cell()
        val mockPiece = Piece()
        toTest.placePiece(mockPiece)
        assertEquals(toTest.isEmpty(), false)
        assertEquals(toTest.getPiece(), mockPiece)
    }
}