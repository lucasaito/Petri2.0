<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Sistema de Receitas Eletrônicas</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f3f3f3;
        }
        header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        section {
            padding: 20px;
            margin: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        form {
            display: flex;
            flex-direction: column;
            max-width: 400px;
            margin: 0 auto;
        }
        label {
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="submit"] {
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type="submit"] {
            background-color: #333;
            color: #fff;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
<header>
    <h1>Sistema de Receitas Eletrônicas</h1>
</header>
<section>
    <h2>Envio de Receita Eletrônica</h2>
    <form action="enviar_receita.php" method="post">
        <label for="nome_medico">Nome do Médico:</label>
        <input type="text" id="nome_medico" name="nome_medico" required />
        <label for="crm_medico">CRM do Médico:</label>
        <input type="text" id="crm_medico" name="crm_medico" required />
        <label for="nome_paciente">Nome do Paciente:</label>
        <input type="text" id="nome_paciente" name="nome_paciente" required />
        <label for="documento_identidade">Documento de Identidade:</label>
        <input
                type="text"
                id="documento_identidade"
                name="documento_identidade"
                required
        />
        <input type="submit" value="Enviar Receita" />
    </form>
</section>
</body>
</html>



