import { Barris } from '@/components/Barris'
import { Layout } from '@/components/Layout'
import Image from 'next/image'
import React from 'react'

export default function gransEstabliments() {
  return (
    <Layout title="Tech4good - Grans Establiments">
      <div className='flex items-center justify-center h-full'>
        <div className='text-2xl w-1/3'>
          Grans Establiments
          <div className='flex w-100 py-5 px-10'>
            <Barris />
          </div>
        </div>
        <div className='w-1/3'>hahahahah </div> 
        <div className="flex items-center justify-center h-full">
          <Image  src={"/mapa.png"} width={500} height={300}/>
        </div> 

      </div>
    </Layout>

  )
}
