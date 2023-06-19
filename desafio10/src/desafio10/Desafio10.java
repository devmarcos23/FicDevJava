/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio10;
import java.sql.*;
import java.util.Scanner;
/*@author Marcos*/
public class Desafio10 {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/ficdevjava";
    private static final String DB_USER = "postgre";
    private static final String DB_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexão com o banco de dados estabelecida.");

            while (true) {
                System.out.println("\n----- Menu -----");
                System.out.println("1. Criar escola:");
                System.out.println("2. Ler informações de uma escola:");
                System.out.println("3. Atualizar informações de uma escola:");
                System.out.println("4. Deletar uma escola");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                Scanner scanner = new Scanner(System.in);
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        criarEscola(connection);
                        break;
                    case 2:
                        lerEscola(connection);
                        break;
                    case 3:
                        atualizarEscola(connection);
                        break;
                    case 4:
                        deletarEscola(connection);
                        break;
                    case 5:
                        System.out.println("Encerrando o programa.");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void criarEscola(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da escola: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço da escola: ");
        String endereco = scanner.nextLine();

        String sql = "INSERT INTO escolas (nome, endereco) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, endereco);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Escola criada com sucesso!");
            } else {
                System.out.println("Falha ao criar escola. Tente novamente.");
            }
        }
    }

    private static void lerEscola(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID da escola: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM escolas WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String endereco = resultSet.getString("endereco");

                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("Endereço: " + endereco);
                } else {
                    System.out.println("Escola não encontrada.");
                }
            }
        }
    }
    
    private static void atualizarEscola(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID da escola que deseja atualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o novo nome da escola: ");
        String novoNome = scanner.nextLine();

        System.out.print("Digite o novo endereço da escola: ");
        String novoEndereco = scanner.nextLine();

        String sql = "UPDATE escolas SET nome = ?, endereco = ? WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, novoNome);
            statement.setString(2, novoEndereco);
            statement.setInt(3, id);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Escola atualizada com sucesso!");
            } else {
                System.out.println("Falha ao atualizar escola. Tente novamente.");
            }
        }
    }

    private static void deletarEscola(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID da escola que deseja deletar: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM escolas WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Escola deletada com sucesso!");
            } else {
                System.out.println("Falha ao deletar escola. Tente novamente.");
            }
        }
    }
}
