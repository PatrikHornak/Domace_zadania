import java.util.ArrayList;

class ChemicalElement
{
    String name;
    String symbolicName;
    int atomNumber;

    public ChemicalElement(String name, String symbolicName, int atomNumber)
    {
        setMeno(name);
        setSymbolicName(symbolicName);
        setAtomNumber(atomNumber);
    }

    private void setMeno(String name)
    {
        this.name=name;
    }

    private void setSymbolicName(String symbolicName)
    {
        this.symbolicName=symbolicName;
    }

    private void setAtomNumber(int atomNumber)
    {
        this.atomNumber=atomNumber;
    }

    public boolean isAlKov()
    {
        ArrayList<Integer> AlKov=new ArrayList<>();
        AlKov.add(3);
        AlKov.add(11);
        AlKov.add(19);
        AlKov.add(37);
        AlKov.add(55);
        AlKov.add(87);

        return AlKov.contains(this.atomNumber);
    }

    public boolean isPrechKov()
    {
        ArrayList<Integer> PrechKov=new ArrayList<>();

        for (int i=21; i<=31; i++)
        {
            PrechKov.add(i);
        }
        for (int i=39; i<=48; i++)
        {
            PrechKov.add(i);
        }
        for (int i=72; i<=80; i++)
        {
            PrechKov.add(i);
        }
        for (int i=104; i<=112; i++)
        {
            PrechKov.add(i);
        }
        return PrechKov.contains(this.atomNumber);
    }

    public boolean isInyKov()
    {
        ArrayList<Integer> InyKov=new ArrayList<>();
        InyKov.add(13);
        InyKov.add(49);
        InyKov.add(50);
        InyKov.add(81);
        InyKov.add(82);
        InyKov.add(83);
        InyKov.add(113);
        InyKov.add(114);
        InyKov.add(115);
        InyKov.add(116);

        return InyKov.contains(this.atomNumber);
    }
}

public class Uloha1
{
    public static void main(String[] args)
    {
        ChemicalElement chem1=new ChemicalElement("Vodik", "H", 1);
        ChemicalElement chem2=new ChemicalElement("Lítium", "Li", 3);
        ChemicalElement KYSLIK=new ChemicalElement("Oxygen", "O", 8);
        ChemicalElement SODIK=new ChemicalElement("Natrium", "Na", 11);
        ChemicalElement ZINOK=new ChemicalElement("Zinc", "Zn", 30);
        ChemicalElement INDIUM=new ChemicalElement("Indium", "In", 49);

        System.out.println("VODÍK 1");
        System.out.println(chem1.isAlKov());
        System.out.println(chem1.isPrechKov());
        System.out.println(chem1.isInyKov());
        System.out.println("");

        System.out.println("LÍTIUM 3");
        System.out.println(chem2.isAlKov());
        System.out.println(chem2.isPrechKov());
        System.out.println(chem2.isInyKov());
        System.out.println("");

        System.out.println("SODÍK 11");
        System.out.println(SODIK.isAlKov());
        System.out.println(SODIK.isPrechKov());
        System.out.println(SODIK.isInyKov());
        System.out.println("");

        System.out.println("KYSLÍK 8");
        System.out.println(KYSLIK.isAlKov());
        System.out.println(KYSLIK.isPrechKov());
        System.out.println(KYSLIK.isInyKov());
        System.out.println("");

        System.out.println("INDIUM 49");
        System.out.println(INDIUM.isAlKov());
        System.out.println(INDIUM.isPrechKov());
        System.out.println(INDIUM.isInyKov());
    }
}

