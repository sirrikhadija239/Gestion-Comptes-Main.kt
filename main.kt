fun main() {
    var cb=CompteBancaire(10000.0)
    var ce=CompteEpargne(10000.0)
    var cp=ComptePayant(10000.0)
    cb.deposer(2000.0)
    cb.retirer(1000.0)
    ce.deposer(2000.0)
    ce.retirer(1000.0)
    cp.deposer(2000.0)
    cp.retirer(1000.0)
    ce.calculInteret()
    println("cb:code=${cb.code} ${cb.toString()}")
    println("ce:code=${ce.code} ${ce.toString()}")
    println("cp:code=${cp.code} ${cp.toString()}")

}