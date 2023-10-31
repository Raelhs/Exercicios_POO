package entidade;

public class OnibusEscolar {

        private int professores;
        private int estudantes;

        public OnibusEscolar() {
            setProfessores(professores);
            setEstudantes(estudantes);
        }

        public int getProfessores() {
            return professores;
        }

        public void setProfessores(int professores) {
            if (professores <= 0) {
                setEstudantes(0);
            } else {

                this.professores = professores;
            }
        }

        public int getEstudantes() {
            return estudantes;
        }

        public void setEstudantes(int estudantes) {
            if (estudantes > 40) {
                setEstudantes(40);
            } else {


                this.estudantes = estudantes;
            }
        }

        public void removerAlunos(int quantidade) {
            if (quantidade <= estudantes) {
                estudantes -= quantidade;
            } else {
                estudantes = 0;
            }
        }
    }



