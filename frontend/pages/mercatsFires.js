 import { Layout } from '@/components/Layout'
 import { Barris } from '@/components/Barris'
 import Image from 'next/image'
 import React, { useEffect, useState } from 'react'
 import axios from 'axios';


 export default function mercatsFires() {
   const [actividades, setActividades] = useState([]);
   const [loading, setLoading] = useState(true);

   useEffect(() => {
     const fetchData = async () => {
       try {
         const response = await axios.get('http:192.168.81.171:8081/tech4good/commercialCensus');
         const data = response.data;
         setActividades(data);
         setLoading(false);
       } catch (error) {
         console.error(error);
       }

     };
     fetchData();
   }, []);
   

   return (
     <Layout title="Tech4good - Mercats i Fires">
       <div className='flex items-center justify-center h-full'>
         <div className='text-2xl w-1/3'>
           Mercats i Fires
           <div className='flex w-100 py-5 px-10'>
             <Barris />
           </div>
         </div>
         <div className='w-1/3 text-primary'>
           <div>
             {loading ? (
               <p>Cargando...</p>
             ) : (
               <ul>
                 {actividades.map((actividad) => (
                   <li>{actividad.Nom_Activitat}</li>
                 ))}
               </ul>
             )}
           </div>
         </div> 
         <div className="flex items-center justify-center h-full">
           <Image  src={"/mapa.png"} width={500} height={300}/>
         </div> 

       </div>
     </Layout>

   )
}
