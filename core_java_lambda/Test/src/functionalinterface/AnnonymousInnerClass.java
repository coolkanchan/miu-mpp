package functionalinterface;


	import java.util.List;
	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.stream.Collectors;

	class Computer {
	    private String maker;
	    private CPU cpu;

	    public Computer(String maker, CPU cpu) {
	        this.maker = maker;
	        this.cpu = cpu;
	    }

	    public String getMaker() {
	        return maker;
	    }

	    public CPU getCpu() {
	        return cpu;
	    }
	}

	class CPU {
	    private double speed;  // in GHz

	    public CPU(double speed) {
	        this.speed = speed;
	    }

	    public double getSpeed() {
	        return speed;
	    }

	    @Override
	    public String toString() {
	        return "CPU{" +
	               "speed=" + speed +
	               '}';
	    }
	}

	public class AnnonymousInnerClass {

	    public static List<CPU> findCPUsByDell(List<Computer> computers) {
	        return computers.stream()
	                .filter(new java.util.function.Predicate<Computer>() {
	                    @Override
	                    public boolean test(Computer comp) {
	                        return "Dell".equals(comp.getMaker());
	                    }
	                })
	                .map(new java.util.function.Function<Computer, CPU>() {
	                    @Override
	                    public CPU apply(Computer comp) {
	                        return comp.getCpu();
	                    }
	                })
	                .sorted(new Comparator<CPU>() {
	                    @Override
	                    public int compare(CPU cpu1, CPU cpu2) {
	                        return Double.compare(cpu2.getSpeed(), cpu1.getSpeed());
	                    }
	                })
	                .collect(Collectors.toList());
	    }

	    public static void main(String[] args) {
	        // Sample data
	        List<Computer> computers = new ArrayList<>();
	        computers.add(new Computer("Dell", new CPU(3.5)));
	        computers.add(new Computer("HP", new CPU(4.0)));
	        computers.add(new Computer("Dell", new CPU(2.5)));

	        // Find and print CPUs from Dell computers sorted by speed in descending order
	        List<CPU> result = findCPUsByDell(computers);
	        for (CPU cpu : result) {
	            System.out.println(cpu);
	        }
	    }
	}
