public class GeneticAlgorithm
{
    public static void main(String[] args)
    {
        //Set a candidate solution
        FitnessCalculation.setSolution("1111000000000000000000000000000000000000000000000000000000001111");

        //Create an initial population
        Population myPop = new Population(50, true);

        //Evolve our population until we reach an optimum solution
        int generationCount = 0;
        while (myPop.getFittest().getFitness() < FitnessCalculation.getMaxFitness()) {
            generationCount ++;
            System.out.println("Generation: " + generationCount + " Fittest: " + myPop.getFittest().getFitness());
            myPop = Algorithm.evolvePopulation(myPop);
        }
        System.out.println("Solution Found!");
        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:");
        System.out.println(myPop.getFittest());
    }
}