public class CPF {

    private String cpf;
    private String nome;

    public CPF() {
    }

    public CPF(String cpf) {
        if (isValidCpfFormat(cpf)) {
            this.cpf = cpf;
        } else {
            this.cpf = null;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (isValidCpfFormat(cpf)) {
            this.cpf = cpf;
        } else {
            this.cpf = null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome.toUpperCase();
        }
    }

    private boolean isValidCpfFormat(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public boolean validarCpf(String cpf) {
        if (!isValidCpfFormat(cpf)) {
            return false;
        }

        int[] digits = new int[11];
        for (int i = 0; i < 11; i++) {
            digits[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += digits[i] * (10 - i);
        }
        int resto1 = soma1 % 11;
        int j = (resto1 == 0 || resto1 == 1) ? 0 : 11 - resto1;

        if (j != digits[9]) {
            return false;
        }

        int soma2 = 0;
        for (int i = 0; i < 9; i++) {
            soma2 += digits[i] * (11 - i);
        }
        soma2 += j * 2;
        int resto2 = soma2 % 11;
        int k = (resto2 == 0 || resto2 == 1) ? 0 : 11 - resto2;

        return k == digits[10];
    }

}
