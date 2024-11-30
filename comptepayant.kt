
class ComptePayant (solde:Double) :CompteBancaire(solde) {
    val montantOperation =5.0
    override fun deposer(montant: Double) {
        super.deposer(montant)
        solde -=montantOperation
    }

    override fun retirer(montant: Double) {
        super.retirer(montant)
        solde-=montantOperation
    }
}