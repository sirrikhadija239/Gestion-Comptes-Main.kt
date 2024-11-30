
open class CompteBancaire (var solde:Double=0.0) {
    var code:Int
    companion object{ var nbrCompte=0}
    init {
        code=++nbrCompte
    }

    override fun toString(): String {
        return "$solde DH"
    }
    open fun deposer (montant:Double){
        solde+=montant

    }
    open fun retirer (montant: Double){
        solde-=montant
    }
}