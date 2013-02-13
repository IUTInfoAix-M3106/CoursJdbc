Statement stmt = conn.createStatement();
ResultSet rset = stmt.executeQuery("SELECT nomE, comm FROM emp");
while (rset.next()) {
    nom = rset.getString("nomE");
    commission = rset.getDouble("comm");
    if (rset.wasNull())
        System.out.println(nom + ": pas de comm");
    else
        System.out.println(nom + " a " + commission+ " euros de commission");
}
