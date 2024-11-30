
class EparComptegne (solde:Double):CompteBancaire(solde) {
val tauxInteret=0.05
    fun calculInteret(){
        solde*=1.05
    }

}