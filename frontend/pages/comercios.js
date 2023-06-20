import { Layout } from '@/components/Layout'
import React from 'react'
import { AiFillShopping } from "react-icons/ai";
AiFillShopping


export default function comercios() {
  return (
    <Layout title="TECH4GOOD - Comerços">
        <div className='grid px-10 py-10'> 
        <h1 className='text-4xl font-extrabold mb-4'>Locals de proximitat</h1>
        <div className='flex flex-wrap gap-10 justify-center mx-10'>
            <div className="card p-4 w-80 justify-center bg-base-100 shadow-xl border-4 border-primary">
                <AiFillShopping className='w-full text-5xl justify-center text-center'></AiFillShopping>
                <div className="card-body w-full">
                <h2 className="font-bold  text-2xl text-center">Mercats i fires</h2>
                <p className='text-center'>Mercats i fires</p>
                </div>
            </div> 
            <div className="card p-4 w-80 justify-center bg-base-100 shadow-xl border-4 border-primary">
                <AiFillShopping className='w-full text-5xl justify-center text-center'></AiFillShopping>
                <div className="card-body w-full">
                    <h2 className="font-bold  text-2xl text-center">Mercats Municipals</h2>
                    <p className='text-center'>Mercats Municipals</p>
                </div>
            </div>            
            <div className="card p-4 w-80 justify-center bg-base-100 shadow-xl border-4 border-primary">
                <AiFillShopping className='w-full text-5xl justify-center text-center'></AiFillShopping>
                <div className="card-body w-full">
                    <h2 className="font-bold  text-2xl text-center">Centres Comercials</h2>
                    <p className='text-center'>Centres Comercials</p>
                </div>
            </div> 
            <div className="card p-4 w-80 justify-center bg-base-100 shadow-xl border-4 border-primary">
                <AiFillShopping className='w-full text-5xl justify-center text-center'></AiFillShopping>
                <div className="card-body w-full">
                    <h2 className="font-bold  text-2xl text-center">Galeries Comercials</h2>
                    <p className='text-center'>Galeries Comercials</p>
                </div>
            </div> 
           <div className="card p-4 w-80 justify-center bg-base-100 shadow-xl border-4 border-primary">
                <AiFillShopping className='w-full text-5xl justify-center text-center'></AiFillShopping>
                <div className="card-body w-full">
                    <h2 className="font-bold  text-2xl text-center">Grans Establiments</h2>
                    <p className='text-center'>Grans Establiments</p>
                </div>
            </div>
          
        </div>
        </div>
    </Layout>
  )
}
