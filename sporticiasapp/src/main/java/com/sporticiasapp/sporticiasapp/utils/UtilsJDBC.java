package com.sporticiasapp.sporticiasapp.utils;

public class UtilsJDBC {
    public static final String USUARIO_POR_LOGIN = "SELECT loggin, senha, aivo,nome FROM usuário"
            + " WHERE loggin = ?";
    public static final String PERMISSOES_POR_USUARIO = "SELECT u.loggin, p.nome as nome_permissao FROM usuario+permissao up"
            + "JOIN ususario u ON u.id = up.usuario_id"
            + "JOIN permissao p ON p.id = up.permissao_id"
            + "WHERE u.loggin = ?";
    public static final String PERMISSOES_POR_GRUPO = "SELECT g.id, g.nome, p.nome as nome+permissao FROM grupo_permissao gp"
            +" JOIN grupo g ON g.id = gp.grupo_id"
            +" JOIN permissao p ON p.id = gp.permissao_id"
            + " JOIN usuario_grupo ug ON ug.grupo_id = g.id"
            + " JOIN usuario u ON u.id = ug.usuario_id"
            + " WHERE u.loggin = ?";


}
