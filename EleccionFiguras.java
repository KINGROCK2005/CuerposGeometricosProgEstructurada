import java.util.*;

public class EleccionFiguras {

    public static void main(String[] args) {
        int opc, intentos = 0, intentosMaximos = 3, intentosRestantes;
        Scanner lector = new Scanner(System.in);

        
            System.out.println("Ingrese qué ejercicio desea que se ejecute: \n 1.Prisma \n 2.Cilindro \n 3.Pirámide \n 4.Cono \n 5.Esfera \n" +
                    " 6.Tronco de Cono \n 7.Tronco de Pirámide \n 8.Huso Esférico  \n 9. Cuña Esférica \n 10.Tetraedro \n 11.Hexaedro \n 12.Octaedro \n 13.Dodecaedro" +
                    " 14.Icosaedro \n 15.Ortoedro\n 16.Zona Esférica y Casquete Esférico");
        opc = lector.nextInt();
        while (intentos < intentosMaximos) 
        {
            
            if (opc >= 1 && opc <= 16) {
                System.out.println("Ha seleccionado la opción " + opc);
                break; 
            } else {
                intentos++;
                intentosRestantes = intentosMaximos - intentos;
                System.out.println("Ingreso inválido. Intentos restantes: " + intentosRestantes);
            }
            opc = lector.nextInt();
        if (intentos == intentosMaximos) {
            System.out.println("Intentos máximos alcanzados. El programa se cerrará.");
            lector.close();
            System.exit(0);
            }
        }



        switch(opc) {
            
            case 1:
            int cantidadLados;
        double longitudLados, altura, areaLateral,areaTotal,volumen;
        double perimetroBase, areaBase, apotema;
        //Solicitar datos al usuario
        System.out.print("Cantidad de lados: ");
        cantidadLados = lector.nextInt();
        System.out.print("Altura: ");
        altura = lector.nextDouble();
        System.out.print("Longitud de los lados: ");
        longitudLados = lector.nextDouble();
        //Procesar datos
        perimetroBase = cantidadLados * longitudLados;
        areaLateral = perimetroBase * altura;
        double alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitudLados / (2 * Math.tan((alfa)/2));
        areaBase = (perimetroBase * apotema)/2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
        //Mostrar los resultados
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        System.exit(0);
                break;

            case 2:
            double areLateral, areTotal, vol;
            double perBase, areBase, h, r;
            
            System.out.println("Ingrese la altura: ");
            h = lector.nextDouble();
            System.out.println("Ingrese el radio: ");
            r = lector.nextDouble();
            areBase = (  Math.PI * (r * r) );
            perBase = ((2 * Math.PI) * r);
            areLateral = perBase * h;
            areTotal = (areLateral * (2 * areBase));
            vol = areBase * h;
    
            System.out.println("Su area lateral es: " + areLateral);
            System.out.println("Su area Total es: " + areTotal);
            System.out.println("Su volumen es: " + vol);
            lector.close();
                break;
  
            case 3:
            double arLateral, arTotal, volume, longlad;
        double periBase, arBase, ha, ra, apo, apPir, canLad;

        System.out.println("Ingrese el radio: ");
        ra = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        ha = lector.nextDouble();
        System.out.println("Ingrese la longitud de los lados: ");
        longlad = lector.nextDouble();
        System.out.print("Cantidad de lados: ");
        canLad = lector.nextInt();

        alfa = (Math.PI/180) * (360/canLad);
        periBase = ((2 * Math.PI) * ra); 
        arBase = (Math.PI * (ra * ra));
        apo = (longlad / (2 * Math.tan(alfa)));
        apPir = (ha * ha + (apo * apo));
        arLateral = periBase * apPir / 2;
        arTotal = arLateral + arBase;
        volume = arBase * ha / 3;

        System.out.println("Su area lateral es: "  + arLateral);
        System.out.println("Su area Total es: " + arTotal);
        System.out.println("Su volumen es:" + volume);
        lector.close();

        case 4:
         double areaLate, areaTot, volum;
         double rad, ht, g, pBase, aBase;
 
         System.out.println("Ingrese la altura: ");
         ht = lector.nextDouble();
         System.out.println("Ingrese el radio: ");
         rad = lector.nextDouble();
 
         pBase = (2 * (Math.PI * rad));
         aBase = (Math.PI * (rad * rad));
         g = (Math.sqrt(ht * ht + ( rad * rad)));
         areaLate = pBase * g /2;
         areaTot = areaLate + aBase;
         volum = aBase * ht /3;
 
         System.out.println("Su generatriz es: " + g);
         System.out.println("Su area lateral es: " + areaLate);
         System.out.println("Su area total es: " + areaTot);
         System.out.println("Su volumen es: " + volum);
         lector.close();

         case 5:
         double radi, areaTotali, volun;
 
         System.out.println("Ingrese el radio: ");
         radi = lector.nextDouble();
         areaTotali = 4 * (Math.PI * (radi * radi));
         volun = 4 * (double)(Math.PI *  Math.pow(radi, 3)) / 3 ;
 
         System.out.println("Su area total es: " + areaTotali);
         System.out.println("Su volumen es: " + volun);
         lector.close();

         case 6:
         double areaTotality, areaLaterality, areaBM;
         double rM, rm, htp, areaBm, volumi, gen;
 
         System.out.println("Ingrese la altura:" );
         htp = lector.nextDouble();
         System.out.println("Ingrese el radio menor: ");
         rm = lector.nextDouble();
         System.out.println("Ingrese el radio mayor: ");
         rM= lector.nextDouble();
 
         areaBM = Math.PI * (rM * rM);
         areaBm = Math.PI * (rm * rm);
         gen = (Math.sqrt(htp * htp + ( rM * rM)));
         areaLaterality = (double) (Math.PI * gen * (rM * rm));
         areaTotality = areaLaterality +  areaBM + areaBm; 
         volumi = 1 * Math.PI * htp *(rM * rM + (rm * rm) + rM + rm )/3;
 
         System.out.println("Su area lateral es: " + areaLaterality);
         System.out.println("Su area Total es: " + areaTotality);
         System.out.println("Su volumen es: " + volumi);
         lector.close();

         case 7:
         float areaLateralM, areaBaseMayor, areaBaseMenor, areaTotaM, canLadM;
        float perBaseMayor, perBaseMenor, volumenXC, aP, hal;
        float areaBaseMayorX , areaBaseMenorX, zx, xz;

        System.out.print("Ingrese la altura: ");
        hal = lector.nextFloat();
        System.out.print("Ingrese el area Base mayor en metros cuadrados: ");
        areaBaseMayor = lector.nextFloat();
        System.out.print("Ingrese el area Base menor en metros cuadrados: ");
        areaBaseMenor = lector.nextFloat();
        System.out.print("Ingrese la cantidad de lados: ");
        canLadM = lector.nextFloat();

        areaBaseMayorX =(float) Math.sqrt(areaBaseMayor);
        areaBaseMenorX =(float) Math.sqrt(areaBaseMenor);
        perBaseMayor = (areaBaseMayorX * canLadM);
        perBaseMenor = (areaBaseMenorX * canLadM);
        // System.out.println(perBaseMayor);
        // System.out.println(perBaseMenor);
        zx =(float) Math.sqrt(areaBaseMayor)/2 - (float) Math.sqrt(areaBaseMenor)/2;
        // System.out.println(zx);
        aP =(float) (Math.pow(zx, 2) + Math.pow(hal, 2));
        xz =(float) (Math.sqrt(aP));
         System.out.println(xz);
        areaLateralM = ((perBaseMayor + perBaseMenor) * (xz/2));
        areaTotaM = (areaLateralM + areaBaseMayor + areaBaseMenor);
        volumenXC =(float)  (hal/3 * (areaBaseMayor + areaBaseMenor) + (float)  (Math.sqrt(areaBaseMayor + areaBaseMenor)));

        System.out.println("Su area lateral es: " + areaLateralM + " metros cuadrados.");
        System.out.println("Su area total es de: " + areaTotaM + " metros cuadrados");
        System.out.println("Su volumen es: " + volumenXC + " metros cubicos");
        lector.close();

        case 8:
        double area, ngrados, radio;

        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();
        System.out.println("Ingrerse los grados: ");
        ngrados = lector.nextDouble();

        area = (4 * Math.PI )* (Math.pow(radio, 2) * ngrados)/ 360;
        System.out.println("El area total es: " + area + " cm. ");

        case 9:
        float rady, nGrados, volumenX;

        System.out.println("Ingrese el radio: ");
        rady = lector.nextFloat();
        System.out.println("Ingrese los grados de la esfera: ");
        nGrados = lector.nextFloat();

        volumenX = (float) (Math.PI * Math.pow(rady, 3) * nGrados) / 270;
        // ((4/3) *  (float) (Math.PI * Math.pow(r, 3) * ngrados) / 360);
        System.out.println("El valor de volumen es: " + volumenX);

        case 10:
        double arista, areaTotalZ, halt, vertice;

        System.out.println("Ingrese la arista del tetraedo: ");
        arista = lector.nextDouble();

        areaTotalZ = Math.pow(arista, 2) * (Math.sqrt (3));
        vertice = (Math.sqrt(2) * (Math.pow(arista, 3)) /12);
        halt = arista * (Math.sqrt(6))/3;

        System.out.println("El area total es: " + areaTotalZ);
        System.out.println("El vertice es: " + vertice);
        System.out.println("La altura es: " + halt);

        case 11:
        double areATotal, aristA, volumyn, diametro;

        System.out.println("Ingrese la arista: ");
        aristA = lector.nextDouble();

        areATotal = 6 * (Math.pow(aristA,2));
        volumyn = Math.pow(aristA, 3);
        diametro =aristA * (Math.sqrt(3));

        System.out.println("El area total es: " + areATotal);
        System.out.println("El volumen d=total es: " + volumyn);
        System.out.println("El diametro es de: " + diametro);
        lector.close();

        case 12:
        double areaTotally, aristaL, volund;

        System.out.println("Inrese la arista: ");
        aristaL = lector.nextDouble();

        areaTotally = 2 * (Math.pow(aristaL,2)* (Math.sqrt(3)));
        volund = (Math.sqrt(2) * Math.pow(aristaL,3))/3;

        System.out.println("El area total es: " + areaTotally);
        System.out.println("El volumen es de: " + volund);
        
        case 13:
        double areaToTal, voLumen, arisTa;

        System.out.println("Ingrese la arista: ");
        arisTa = lector.nextDouble();

        areaToTal = (double)3 * (arisTa * arisTa) * (Math.sqrt(25 + 10) * Math.sqrt(5));
        voLumen = (double)(15 +  (7 *Math.sqrt(5))) * Math.pow(arisTa,3)/4;

        System.out.println("El area Total es de: " + areaToTal);
        System.out.println("Su volumen es: " + voLumen);

        case 14:
        double areaTotaLX, revolumen, aristota;

        System.out.println("Ingrese la aristota: ");
        aristota = lector.nextDouble();

        areaTotaLX = 5 * (Math.pow(aristota,2))*(Math.sqrt(3));
        revolumen = 5 * (3 + Math.sqrt(5) *Math.pow(aristota, 3)/12) ;

        System.out.println("El area total es de: " + areaTotaLX);
        System.out.println("Su volumen es: " + revolumen);

        case 15:
        double  diagonal, verticeSX;
        double  a, b, c, anguloTotal;

        System.out.println("Ingrese el lado mayor: ");
        a = lector.nextDouble();
        System.out.println("Ingrese el lado menor: ");
        b =  lector.nextDouble();
        System.out.println("Ingresela altura de la cara");
        c = lector.nextDouble();

        anguloTotal = 2 * ((a * b) + (a * c) + (b * c));
        diagonal = (Math.sqrt((a * a) + (b * b) + (c * c)));
        verticeSX =  a * b *c;

        System.out.println("El angulo total es de: " + anguloTotal);
        System.out.println("La diagonal tiene un valor de: " + diagonal);
        System.out.println("El vertice es de: " + verticeSX);
        lector.close();

        case 16:
        double  volZonaEsf, areazonaEsf, rmen, haltur;
        double volCasEsf, areaCasEsf, rMay;

        System.out.println("Ingrese el radio menor: ");
        rmen = lector.nextDouble();
        System.out.println("Ingrese el radio mayor: ");
        rMay = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        haltur = lector.nextDouble();

        areazonaEsf = 2 * (Math.PI * (rMay * haltur));
        volZonaEsf = (Math.PI * haltur * ((haltur * haltur) + (3 * (rmen * rmen) + (3 * (rmen * rmen))))) / 6;
        areaCasEsf = 2 * (Math.PI * (rMay * haltur));
        volCasEsf = (Math.PI * (haltur * haltur) * (3 * rMay) - haltur)/3; 

        System.out.println("El area de la zona esferica es: " + areazonaEsf);
        System.out.println("El volumen de la zona esferica es: " + volZonaEsf);
        System.out.println("El area del Casquete esferico es: " + areaCasEsf);
        System.out.println("El volumen del Casquete esferico es: " + volCasEsf);
        lector.close();

         default:
                System.out.println("Opción no válida. El programa se cerrará.");
                lector.close();
                System.exit(0);
        }
            
         

        lector.close();
    }
}