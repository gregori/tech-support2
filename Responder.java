import java.util.ArrayList;
import java.util.Random;

/**
 * A classe responder representa um objeto gerador de resposta.
 * É usada para gerar uma resposta automática.
 * Esta é a segunda versão desta classe. Desta vez, geramos
 * algum comportamento aleatório, selecionando uma frase de uma lista
 * predefinida de respostas.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.2
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;

    /**
     * Constrói um Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }

    /**
     * Gera uma resposta.
     * 
     * @return  Uma String que deve ser mostrada como a resposta
     */
    public String generateResponse()
    {
        // Pega um número aleatório para o índice na lista de respostas.
        // O número será entre 0 (inclusive) e o tamanho da lista (exclusivo)
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }

    /**
     * Constrói uma lista de respostas padrão, a partir da qual escolhemos uma
     * se não soubermos o que mais dizer.
     */
    private void fillResponses()
    {
        responses.add("Isso soa estranho. Poderia detalhar esse problema?");
        responses.add("Nenhum outro cliente jamais reclamou sobre isso. \n" +
                      "Qual é a configuração do seu sistema?");
        responses.add("Isso parece interessante. Diga-me mais...");
        responses.add("Eu preciso de mais informação sobre isso.");
        responses.add("Já checou se você não tem um conflito de dll?");
        responses.add("Isso é explicado no manual. Você já leu o manual?");
        responses.add("Sua descrição é bem falha. Você tem um especialista aí\n" +
                      "que poderia descrever isso com mais detalhes?");
        responses.add("Isso não é um bug, é uma funcionalidade!");
        responses.add("Você poderia elaborar mais isso?");
    }
}
