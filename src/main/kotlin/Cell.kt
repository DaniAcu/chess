class Cell (private var piece: Piece? = null) {
    fun isEmpty() = piece == null;

    fun clean() {
        piece = null
    }

    fun getPiece () = piece

    fun placePiece(newPiece: Piece) {
        piece = newPiece
    }
}

/*
interface Cel{
    fun isEmpty() : Boolean
    fun placePiece(piece: Piece): Cel
    fun clean(): Cel
}

interface HoldsPiece {
    fun getPiece() : Piece
}

class CelEmpty(): Cel {
    override fun isEmpty() = true

    override fun clean() = CelEmpty()

    override fun placePiece(piece: Piece) = CelOccupied(piece)
}

class CelOccupied(val piece: Piece): Cel, HoldsPiece {
    override fun isEmpty() = true

    override fun clean() = CelEmpty()

    override fun placePiece(piece: Piece) = CelOccupied(piece)

    override fun getPiece() = piece
}

*/
